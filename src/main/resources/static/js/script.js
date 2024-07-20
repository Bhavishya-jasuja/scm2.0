let currentTheme= getTheme();

//todo

function changeTheme()
{

}

//set theme to localStorage
function setTheme(theme)
{
    localStorage.setItem("theme", theme);
}

//get item from localStorage
function getTheme()
{
    let theme=localStorage.getItem("theme");
    return theme ? theme : "light";
}