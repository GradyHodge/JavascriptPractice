document.getElementById("divvy").onclick = function changeContent() {
  document.getElementById("divvy").innerHTML = "this one worked";
  document.getElementById("divvy").style = "Color: red";
};

///////////////////////////////////////////////////////////////////////////////////////////
//the el is a dynamic placeholder that will subsitute the associated element when the button is clicked. In this case the el variable element will become the class name that is placed in each of the buttons' attribute onclick function.

function printContent(el) {
  var restorepage = document.body.innerHTML;
  //this will store all of the content of the body so we can restore it at the end of the code block
  var printcontent = document.getElementById(el).innerHTML;
  //this variable gets only the specific content from its tag specified by its classname
  document.body.innerHTML = printcontent;
  //this changes the content of the HTML body to only the content of the selected div tag
  window.print();
  //this will print the whole page -- partial page in this case
  document.body.innerHTML = restorepage;
  //this puts back the entire content of the body as it was originally.
}

///////////////   REFACTOR   ///////////////////////////////////////////////////////////////////

sendPrinter = (content, restorepage) => {
  document.body.innerHTML = content;
  window.print();
  document.body.innerHTML = restorepage;
  // return;
};
printContent = async el => {
  let restorepage = document.body.innerHTML;
  let content = document.getElementById(el).innerHTML;
  sendPrinter(content, restorepage);
};
