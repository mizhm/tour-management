function showTab(tabName) {
    const tabs = document.querySelectorAll('.tab');
    tabs.forEach(tab => {
        tab.classList.remove('active');
    });
    document.querySelector(`.tab[onclick="showTab('${tabName}')"]`).classList.add('active');

    const content = document.getElementById('booking-history-content');
    content.innerHTML = `<p>No Booking History</p>`;
}
