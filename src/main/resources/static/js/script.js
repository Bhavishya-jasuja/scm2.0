let currentTheme = getTheme();

//initial-->
document.addEventListener("DOMContentLoaded", () => {
  changeTheme();
});
//todo

function changeTheme() {
  //set the web page
  document.querySelector("html").classList.add(currentTheme);

  //set the listner to change theme button
  const changeThemebutton = document.getElementById("theme_change_button");

  changeThemebutton.addEventListener("click", (event) => {
    const oldtheme = currentTheme;

    if (currentTheme === "dark") {
      currentTheme = "light";
    } else {
      currentTheme = "dark";
    }

    //update the localstorage now
    setTheme(currentTheme);

    //remove the old theme
    document.querySelector("html").classList.remove(oldtheme);
    //set the current theme
    document.querySelector("html").classList.add(currentTheme);

    // change the text of currenttheme
    changeThemebutton.querySelector("span").textContent =
      currentTheme == "light" ? "Dark" : "Light";
  });
}

//set theme to localStorage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

//get item from localStorage
function getTheme() {
  let theme = localStorage.getItem("theme");
  return theme ? theme : "light";
}
