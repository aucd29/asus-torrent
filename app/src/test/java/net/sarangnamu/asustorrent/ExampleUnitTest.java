package net.sarangnamu.asustorrent;


import android.util.Log;

import net.sarangnamu.asustorrent.net.Api;
import net.sarangnamu.common.okhttp.BasicAuthInterceptor;

import org.junit.Test;

import java.io.IOException;
import java.net.Proxy;

import okhttp3.Credentials;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    private static final String IP = "192.168.1.1:8081";

    @Test
    public void getTorrentList() {
        try {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new BasicAuthInterceptor("", ""))
                    .build();

            String uri = String.format(Api.URI_STATUS, IP);

            Request request = new Request.Builder().url(uri).build();
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            ResponseBody body = response.body();
            if (body != null) {
                Log.e("", body.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            assert true;
        }
    }
}
