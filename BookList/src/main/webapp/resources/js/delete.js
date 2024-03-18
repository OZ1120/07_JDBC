/* delete.js*/ 

const deleteBtnList = document.querySelectorAll(".delete-btn");

for(let btn of deleteBtnList){

  btn.addEventListener("click", e => {



    // 책재목 얻어오기
    const bookTitle = e.target.parentElement.parentElement.children[0].innerText;
    //const bookTitle = e.target.closest("tr").children[0].innerText;
    console.log(bookTitle);    

    if(confirm(`${bookTitle} 부서를 정말 삭제 하시겠습니까?`)){

    const form = document.createElement("form");
    form.action = "/booklist/delete";
    form.method= "POST";

    const input = document.createElement("input");
    input.type = "hidden";
    input.value = bookTitle;
    input.name = "bookTitle";

    form.append(input);

    document.querySelector("body").append(form);

    form.Submit();
  } else {
    // 취소 클릭시
    alert("삭제 취소");

  }

  });


}
