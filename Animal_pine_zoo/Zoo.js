// Wait until DOM is loaded
document.addEventListener("DOMContentLoaded", () => {
  // Get all the animal cards
  const animalCards = document.querySelectorAll(".animal-card");

  // Get references to the selected animal display elements
  const selectedImg = document.getElementById("selected-animal-img");
  const extraImg = document.getElementById("animal-extra-img");
  const animalName = document.getElementById("animal-name");
  const sentence = document.getElementById("sentence");

  // Loop through all animal cards and add click event listeners
  animalCards.forEach(card => {
    card.addEventListener("click", () => {
      // Get data from clicked card
      const name = card.getAttribute("data-name");
      const mainImage = card.getAttribute("data-main-image");
      const extraImage = card.getAttribute("data-extra-images");
      const description = card.getAttribute("data-description");

      // Update the selected display section
      selectedImg.src = mainImage;
      extraImg.src = extraImage;
      animalName.textContent = name;
      sentence.textContent = description;

      // Optionally scroll to the display
      document.querySelector(".animal-display").scrollIntoView({ behavior: "smooth" });
    });
  });
});
