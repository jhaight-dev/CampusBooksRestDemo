import{
    createHeader
} from "./Header.js"
import{
    createFooter
}from "./Footer.js"
import {
    displayHomeView
} from "./displayHomeView.js"
import {
    allCampusesJson
} from "./sampleAllCampuses.js"

// import {
//     displaySingleCampus
// } from "./displaySingleCampus.js"

const container = document.querySelector(".container");
container.append(createHeader());
container.append(displayHomeView(allCampusesJson));
container.append(createFooter());
