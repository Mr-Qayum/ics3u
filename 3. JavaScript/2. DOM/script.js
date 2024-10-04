const title = document.getElementById("title");
title.style.color = "green";
title.style.textAlign = "center";

const titles = document.getElementsByTagName("h2");

for (const element of titles) {
  element.style.color = "red";
  element.style.textAlign = "center";
  element.innerText = "Bye";
}

const special = document.getElementsByClassName("special");

for (const element of special) {
  element.style.color = "blue";
}

const section = document.createElement("div");

for (let i = 0; i < 5; i++) {
  const para = document.createElement("p");
  para.innerHTML = `${i} Item`;
  para.style.textAlign = "center";
  section.appendChild(para);
}

document.body.appendChild(section);

const anchor = document.createElement("a");
anchor.innerHTML = "Google";
anchor.href = "https://www.google.ca";
anchor.target = "_blank";
anchor.style.display = "block";

document.body.appendChild(anchor);

const button = document.createElement("button");
button.innerHTML = "Hide List";
button.style.marginTop = "2rem"
document.body.appendChild(button);

let show = true;

button.addEventListener('click', () => {
  show = !show;
  section.style.display = show ? "block" : "none";
  button.innerHTML = show ? "Hide List" : "Show List";
})

const button2 = document.createElement("button");
button2.innerHTML = "Enlarge Text";
document.body.appendChild(button2);

button2.addEventListener('click', () => {
  title.style.cssText = "font-size: 100px; text-align: center; color: green; transform: rotate(360deg); transition: all 5s"
})