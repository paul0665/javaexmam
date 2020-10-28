/*
 *
 * MIT License
 *
 * Copyright (c) 2020 Paul(paul0665)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class test {

  public static void main(String[] args){

    String url = "https://api.github.com/repos/mc-serverworld/worldMISF/releases/latest";

    try {

      CloseableHttpClient httpClient = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(url);
      request.addHeader("Accept", "application/vnd.github+json");
      HttpResponse result = httpClient.execute(request);
      String json = EntityUtils.toString(result.getEntity(), "UTF-8");
      JSONObject message = new JSONObject(json);

      JSONArray assetslist = new JSONArray(message.get("assets").toString());

      JSONObject assets_0 = (JSONObject) assetslist.get(0);
      assets_0 = new JSONObject(assets_0.toString(0));
      downloadNet(assets_0.getString("browser_download_url"),assets_0.getString("name"));
      System.out.println(assets_0.getString("browser_download_url"));

      JSONObject assets_1 = (JSONObject) assetslist.get(1);
      assets_1 = new JSONObject(assets_1.toString(1));
      downloadNet(assets_1.getString("browser_download_url"),assets_1.getString("name"));
      System.out.println(assets_1.getString("browser_download_url"));

      JSONObject assets_2 = (JSONObject) assetslist.get(2);
      assets_2 = new JSONObject(assets_2.toString(2));
      downloadNet(assets_2.getString("browser_download_url"),assets_2.getString("name"));
      System.out.println(assets_2.getString("browser_download_url"));
    } catch (IOException ex) {
    }


    System.out.println("Hello world");
  }
  public static void downloadNet(String surl,String filename) throws MalformedURLException {
    int bytesum = 0;
    int byteread = 0;
    URL url = new URL(surl);
    try {
      URLConnection conn = url.openConnection();
      InputStream inStream = conn.getInputStream();
      FileOutputStream fs = new FileOutputStream("D:/" +filename);
      byte[] buffer = new byte[1204];
      int length;
      while ((byteread = inStream.read(buffer)) != -1) {
        bytesum  = byteread;
        System.out.println(bytesum);
        fs.write(buffer, 0, byteread);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}