package net.sarangnamu.common.okhttp;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by <a href="mailto:aucd29@gmail.com">Burke Choi</a> on 2016. 6. 14.. <p/>
 */
public class BasicAuthInterceptor implements Interceptor {
    private String mCredentials;

    public BasicAuthInterceptor(String user, String password) {
        this.mCredentials = Credentials.basic(user, password);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request authenticatedRequest = request.newBuilder()
                .header("Authorization", mCredentials).build();

        return chain.proceed(authenticatedRequest);
    }
}
