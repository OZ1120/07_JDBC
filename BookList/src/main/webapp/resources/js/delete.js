/* delete.js*/ 

const deleteBtnList = document.querySelectorAll(".delete-btn");

for(let btn of deleteBtnList){

  btn.addEventListener("click", e => {

    // 책제목 얻어오기
    const bookTitle = e.target.parentElement.parentElement.children[0].innerText;
    //const bookTitle = e.target.closest("tr").children[0].innerText;
    console.log(bookTitle);    

    if(confirm(`${bookTitle}을/를 삭제 하시겠습니까?`)){
      location.href="/booklist/delete?bookTitle=" + bookTitle;

  } else {
    // 취소 클릭시
    alert("삭제 취소");

  }

  });


}
