
const updateBtn = document.querySelector(".update-btn");

updateBtn.addEventListener("click", e=> {

  const bookTitle = e.target.dateset.bookTitle;

  location.href =`/booklist/update?bookTitle=${bookTitle}`;

});