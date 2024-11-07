
document.getElementById("contactForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Ngăn form gửi đi thật sự

    // Lấy giá trị từ các trường trong form
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const phone = document.getElementById("phone").value;
    const subject = document.getElementById("subject").value;
    const message = document.getElementById("message").value;

    // Kiểm tra đầu vào (nếu cần)
    if (name && email && phone && subject && message) {
        alert("Message send successfull!");
    } else {
        alert("Please fill out all fields.");
    }

    // Đặt lại form (tùy chọn)
    document.getElementById("contactForm").reset();
});
