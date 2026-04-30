
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    // Khai báo Logger để thay thế System.out.println theo yêu cầu đề bài
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    /**
     * Tính giai thừa của một số nguyên n
     * Yêu cầu: n >= 0
     */
    public long getFactorial(int n) {
        logger.info("Đang tính giai thừa cho số: {}", n); // Structured logging

        if (n < 0) {
            logger.error("Lỗi: Số nhập vào không được âm ({})", n);
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n == 0 || n == 1) return 1;

        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }

        logger.info("Kết quả giai thừa của {} là: {}", n, product);
        return product;
    }
    public int TruDiem(int a,int b){
return a-b;
    }
    // Ép Git push lần 2 để test tốc độ caching
}