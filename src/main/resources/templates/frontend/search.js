document.addEventListener("DOMContentLoaded", function() {
    const locationInput = document.querySelector(".search-content__location-input");
    const locationDropdown = document.querySelector(".sub-nav-location");

    // Lấy tất cả các thẻ li
    const locationItems = document.querySelectorAll(".sub-nav-location ul li");

    // Gán sự kiện click cho từng thẻ li
    locationItems.forEach(item => {
        item.addEventListener("click", function() {
            const locationName = item.querySelector("span").textContent;
            locationInput.value = locationName; // Gán giá trị cho input
            locationDropdown.style.display = "none"; // Ẩn dropdown sau khi chọn
        });
    });

    // Hiển thị dropdown khi input được focus
    locationInput.addEventListener("focus", function() {
        locationDropdown.style.display = "block"; // Hiển thị dropdown
    });

    // Ẩn dropdown khi click bên ngoài
    document.addEventListener("click", function(event) {
        if (!locationInput.contains(event.target) && !locationDropdown.contains(event.target)) {
            locationDropdown.style.display = "none"; // Ẩn dropdown nếu nhấp bên ngoài
        }
    });
});