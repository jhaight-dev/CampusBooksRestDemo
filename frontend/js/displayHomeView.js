import {
    displaySingleCampus
} from "./displaySingleCampus.js"

const displayHomeView = function (campuses) {
    const mainElement = document.createElement("main");
    mainElement.classList.add("main-content")
    const sectionElement = document.createElement("section");
    sectionElement.classList.add("campus-list");
    mainElement.appendChild(sectionElement);

    // let campusListHtml = "";

    campuses.forEach(campus => {
        let campusElement = document.createElement('div')
        campusElement.classList.add("campus");
        let campusLocationElement = document.createElement("h2");
        campusLocationElement.classList.add("campus-location")
        campusLocationElement.innerText = campus.location;
        campusLocationElement.addEventListener('click', () => displaySingleCampus(campus));
        let campusTechStackElement = document.createElement("h3");
        campusTechStackElement.classList.add("campus-tech-stack");
        campusTechStackElement.innerText = campus.techStack;
        campusElement.appendChild(campusLocationElement);
        campusElement.appendChild(campusTechStackElement);
        sectionElement.appendChild(campusElement);

    });

    return mainElement;
}


export {
    displayHomeView
}