function toggleFAQ(item) {
    const answer = item.querySelector("p");
    answer.style.display = answer.style.display === "block" ? "none" : "block";
}
function toggleContent(button) {
    // Lấy phần tử nội dung
    const content = button.previousElementSibling;

    // Thay đổi trạng thái hiển thị
    content.classList.toggle("hidden");

    // Đổi ký hiệu trên nút giữa "+" và "-"
    if (content.classList.contains("hidden")) {
        button.textContent = "+";
    } else {
        button.textContent = "-";
    }
}
