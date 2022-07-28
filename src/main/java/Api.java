import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static org.apache.http.impl.client.HttpClientBuilder.*;

public class Api {

    public static List<Product> httpClientSeller(String url) throws IOException {
        CloseableHttpClient httpClient = create()
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/15.5 Safari/605.1.15")
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();

        HttpGet request = new HttpGet(url);
        request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
        CloseableHttpResponse response = httpClient.execute(request);
        List<Product> post = mapper.readValue(response.getEntity().getContent(), new TypeReference<List<Product>>() {});

        return post;
    }
    public static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        String key ="&key=YjI2YmEyYzgtNmMxNi00YzdlLWI2MGEtYzNmMTExNTQwNTMy";
        final String urlOrders ="https://suppliers-stats.wildberries.ru/api/v1/supplier/orders?";
        final String urlSales ="https://suppliers-stats.wildberries.ru/api/v1/supplier/sales?";

        Scanner scanner = new Scanner(System.in);

         while (true){
                System.out.println("----------------------------------------");
                System.out.println("Выберите операцию");
                System.out.println("----------------------------------------");
                System.out.println("1.Заказы");
                System.out.println("2.Выкупы");
                System.out.println("3.Отчет за день");
                System.out.println("4.Отчет за день");

        String input = scanner.nextLine();
        int operation = Integer.parseInt(input);
        switch (operation){
                case 1:
                    System.out.println("Введите дату формат год-месяц-день");
                    String dateA = "dateFrom="+scanner.nextLine();
                    List<Product> post = httpClientSeller(urlOrders+dateA+key);
                    post.stream().forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Введите дату формат год-месяц-день");
                    String dateB = "dateFrom="+scanner.nextLine();
                    List<Product> postSales = httpClientSeller(urlSales+dateB+key);
                    postSales.stream().forEach(System.out::println);
                    break;
                case 3:
                    String dateC = "dateFrom="+ LocalDate.now();;
                    List<Product> salesDay = httpClientSeller(urlSales+dateC+key);
                    long countProduct =  salesDay.stream().count();
                    System.out.println("Сегодня было выкупленно: " + countProduct + " товаров");
                    List<Product> postDay = httpClientSeller(urlOrders+dateC+key);
                    long orderProdukt =  postDay.stream().count();
                    System.out.println("Сегодня было заказано: " + orderProdukt + " товаров");

                case 4:


           }
       }
    }
}



