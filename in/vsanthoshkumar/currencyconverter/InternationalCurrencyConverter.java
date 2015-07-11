package in.vsanthoshkumar.currencyconverter;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class InternationalCurrencyConverter
{
	public static void main(String[] args)
	{
		try
		{
			HttpClient httpclient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet("http://download.finance.yahoo.com/d/quotes.csv?s=INRUSD=X&f=l1&e=.csv");
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			httpclient.execute(httpGet, responseHandler);
			httpclient.getConnectionManager().shutdown();
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
