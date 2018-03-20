package com.mao.beanstalk; /**
 * 
 */


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Dustin Norlander
 * @created Nov 15, 2010
 * 
 */

public class Example {

	protected static Log log = LogFactory.getLog(Example.class);


	/**
	 * @param args
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		//Example usage for a


		try {
			//clientExample();
			while (true){
				BeanstalkClient client = new BeanstalkClient("47.100.82.119", 11300, "hehehehhe");
				BeanstalkJob job = client.reserve(10);
				//System.out.print(Arrays.toString(job.getData()));

				String t= new String(job.getData(),"UTF-8");
				client.release(job.getId(),1,30);
				System.out.print(t);

				//String转回json
				JSONArray array = JSONArray.fromObject(t);

				for (Object object : array) {
					JSONObject o = JSONObject.fromObject(object);
					System.out.println(o.getString("username"));
					System.out.println(o.getString("time"));
				}
			}

		} catch (BeanstalkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}


	}
	
	/**
	 * Example for using an unpooled client
	 * @throws BeanstalkException 
	 */
	public static void clientExample() throws BeanstalkException, IOException {
		BeanstalkClient client = new BeanstalkClient("47.100.82.119", 11300, "Getupearly");

		log.info("Putting a job111111");
//		HashMap<String,Object> o = new HashMap<String, Object>();
//		o.put("1","sdsd");
//		o.put("2","省道");
		ArrayList al = new ArrayList();
		al.add("用户1");
		al.add(new Date());


		//存入数据用json转String再转byte[]
		Map params =  new HashMap();
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);

		params.put("username", "用户3");
		params.put("time",dateString);
		System.out.print(dateString);
		JSONArray array = JSONArray.fromObject(params);
//		ByteArrayOutputStream os = new ByteArrayOutputStream();
//		ObjectOutputStream oos = new ObjectOutputStream(os);
		//oos.writeObject(o);
		client.put(10, 10, 5000,array.toString().getBytes());
		//al.toString().getBytes()
//os.toByteArray()
		BeanstalkJob job = client.reserve(60);
		//client.release(job,11,60);
		log.info("GOt job: " + job);
		System.out.print("GOt job: " + job);
		//client.release(job.getId(),1,0);
		//client.deleteJob(job);
		client.close(); //closes the connection
	}
	

	public static void pooledExample()  throws BeanstalkException {
		BeanstalkPool pool = new BeanstalkPool("localhost", 8010, 
				30, //poolsize 
			"example" //tube to use
		);
		
		BeanstalkClient client = pool.getClient();
		
		log.info("Putting a job");
		client.put(1l, 0, 5000, "this is some data".getBytes());
		BeanstalkJob job = client.reserve(60);
		log.info("GOt job: " + job);
		client.deleteJob(job);
		client.close();  //returns the connection to the pool
	}
}
