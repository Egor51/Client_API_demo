import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.apache.http.impl.client.HttpClientBuilder.*;

public class Api {
    public static ObjectMapper mapper = new ObjectMapper();
    public static List<Product> httpClientSeller(String url1) throws IOException {
        CloseableHttpClient httpClient = create()
                .setUserAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36\n")
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet(url1);
        request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
        CloseableHttpResponse response = httpClient.execute(request);
        List<Product> post = (ArrayList<Product>) mapper.readValue(response.getEntity().getContent(), new TypeReference<List<Product>>() {
        });
        return post;
    }

    public String creareUrl(){

        return null;
    }


    public static void main(String[] args) throws IOException {
        String key = "YjI2YmEyYzgtNmMxNi00YzdlLWI2MGEtYzNmMTExNTQwNTMy";
        final String url = "https://suppliers-stats.wildberries.ru/api/v1/supplier/orders?dateFrom=2022&key=YjI2YmEyYzgtNmMxNi00YzdlLWI2MGEtYzNmMTExNTQwNTMy";

       List<Product> post = httpClientSeller(url);
       post.stream().forEach(System.out::println);

        }
    }



