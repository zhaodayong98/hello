import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class hello {

    public static void main(String[] args) throws ParseException {
//        Date current=new Date();
//        LocalDate localDate=current.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        String dateString = new Date().toString();
// 创建 SimpleDateFormat 对象，指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 使用 SimpleDateFormat 格式化为字符串
        String formattedDate = sdf.format(new Date());
// 将字符串解析为 java.util.Date 对象
        java.util.Date date = sdf.parse(formattedDate);
// 将 java.util.Date 对象转换为 java.sql.Date 对象
        Date sqlDate = new Date(date.getTime());
        System.out.println(sqlDate);
//        Scanner sc=new Scanner(System.in);
//        String c=sc.next();
//        System.out.println("c:"+c);
//        String d=sc.nextLine();
//        System.out.println("d:"+d);
        /**
         * 0.0 see me playing phone
         */
        int []arr=new int[]{2,45,-2,33,15,80,9,22,12,999};
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        /**
         *  二分
         */
        System.out.println();
        System.out.println(10000/23*14+7500/21*3);
        System.out.println(10000/23*9);

//        System.out.println(24000*16*0.8);

        LocalDateTime localDateTime= LocalDateTime.now();
        long currentTime = localDateTime.toInstant(ZoneOffset.UTC).getEpochSecond();
//        System.out.println(currentTime);

        long start= 1692930833000L;

        Instant instant = Instant.ofEpochSecond(start);

        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        LocalDate date1 = LocalDate.from(dateTime);



        long timestamp = System.currentTimeMillis();
        System.out.println(timestamp);
    }
}