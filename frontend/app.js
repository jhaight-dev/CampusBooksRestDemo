import {
    createHeader
} from "./js/Header.js"
import {
    allCampuses
} from "./js/sampleAllCampusJson.js"
import {
    displayHomeView
} from "./js/displayHomeView.js"
import {
    createFooter
} from "./js/Footer.js"

document.querySelector('.container').prepend(createHeader());
document.querySelector('.container').appendChild(displayHomeView(allCampuses));

document.querySelector('.container').appendChild(createFooter());
// document.querySelector('.container').append("This is append");
// document.querySelector('.container').appendChild("This is append");