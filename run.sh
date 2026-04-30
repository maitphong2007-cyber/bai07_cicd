#!/bin/bash

# Khai báo đường dẫn tuyệt đối đến thư mục chứa Maven của IntelliJ
MVN_CMD="C:/Program Files/JetBrains/IntelliJ IDEA 2025.3.3/plugins/maven/lib/maven3/bin/mvn"

echo "==================================================="
echo "  BÀI 05: KIỂM TRA ĐỘ BAO PHỦ CODE (LOCAL TEST) "
echo "==================================================="

echo ""
echo "[1] Đang dọn dẹp các file cũ (mvn clean)..."
"$MVN_CMD" clean

echo ""
echo "[2] Đang kiểm tra lỗi Checkstyle (mvn checkstyle:check)..."
"$MVN_CMD" checkstyle:check

echo ""
echo "[3] Đang chạy Test và Đo lường Coverage (mvn verify)..."
"$MVN_CMD" verify

echo ""
echo "==================================================="
echo "  HOÀN THÀNH! KIỂM TRA KẾT QUẢ JACOCO BÊN TRÊN"
echo "  Mở target/site/jacoco/index.html để xem báo cáo"
echo "==================================================="