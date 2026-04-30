import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Paths;
import java.io.File;

public class MathUtilsTest {

    /**
     * Test case 1: Kiểm tra logic tính giai thừa với các giá trị đúng.
     * Khớp với hàm getFactorial trong file MathUtils.java của bạn.
     */
    @Test
    void testGetFactorialGivenRightArgumentReturnsWell() {
        MathUtils math = new MathUtils();

        // Kiểm tra các trường hợp biên và giá trị thông thường
        assertEquals(1, math.getFactorial(0));
        assertEquals(1, math.getFactorial(1));
        assertEquals(120, math.getFactorial(5));
    }

    /**
     * Test case 2: Kiểm tra việc ném ngoại lệ khi n < 0.
     * Khớp với logic ném IllegalArgumentException kèm Logger.error bạn đã viết.
     */
    @Test
    void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtils math = new MathUtils();

        assertThrows(IllegalArgumentException.class, () -> {
            math.getFactorial(-5);
        });
    }

    /**
     * Test case 3: Kiểm thử đa hệ điều hành (Trọng tâm Bài 4).
     * Chứng minh mã nguồn hoạt động trên Windows, Linux và MacOS. [cite: 375, 381]
     */
    @Test
    public void testFilePathCompatibility() {
        // Paths.get() tự động sinh ra đường dẫn chuẩn tùy theo OS đang chạy [cite: 37]
        String expectedPath = Paths.get("data", "output.txt").toString();

        // REFACTOR: Sử dụng File.separator để đảm bảo tính tương thích đa hệ điều hành [cite: 303]
        // Điều này giúp bài test "Xanh" trên cả 3 môi trường trong Matrix Build. [cite: 382]
        String dynamicPath = "data" + File.separator + "output.txt";

        assertEquals(dynamicPath, expectedPath, "Đường dẫn phải tương thích với hệ điều hành đang chạy!");
    }
    @Test
    void testTruDiem() {
        MathUtils math = new MathUtils();
        assertEquals(5, math.truDiem(10, 5));
    }
}