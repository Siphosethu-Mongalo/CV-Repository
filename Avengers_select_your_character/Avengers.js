document.addEventListener('DOMContentLoaded', function() {
    // Select all character cards
    const characterCards = document.querySelectorAll('.character-card');
    const selectedCharacterImg = document.getElementById('selected-character-img');
    const characterName = document.getElementById('character-name');
    const birthplace = document.getElementById('birthplace');
    const extraImage = document.getElementById('character-extra-img');
    
    // Stats elements
    const intelligenceBar = document.getElementById('intelligence-bar');
    const durabilityBar = document.getElementById('durability-bar');
    const powerBar = document.getElementById('power-bar');
    const combatBar = document.getElementById('combat-bar');
    const speedBar = document.getElementById('speed-bar');
    
    // Select button
    const selectButton = document.querySelector('.select-button');
    
    // Function to update character display
    function updateCharacterDisplay(card) {
        const characterImage = card.querySelector('img').src;
        const name = card.getAttribute('data-character');
        const birth = card.getAttribute('data-birthplace');
        const extraImg = card.getAttribute('data-extra-image');
        
        // Update main display
        selectedCharacterImg.src = characterImage;
        characterName.textContent = name;
        birthplace.textContent = birth;
        
        // Update extra image
        extraImage.src = extraImg;
        
        // Update stats with actual values from data attributes
        updateStatBar(intelligenceBar, card.getAttribute('data-intelligence'));
        updateStatBar(durabilityBar, card.getAttribute('data-durability'));
        updateStatBar(powerBar, card.getAttribute('data-power'));
        updateStatBar(combatBar, card.getAttribute('data-combat'));
        updateStatBar(speedBar, card.getAttribute('data-speed'));
    }
    
    // Function to update stat bars with actual values
    function updateStatBar(barElement, value) {
        // Ensure the value is within 0-100 range (assuming max is 10)
        const percentage = Math.min(100, Math.max(0, value * 100));
        barElement.style.width = '0'; // Reset for animation
        setTimeout(() => {
            barElement.style.width = percentage + '%';
            // Add the numeric value inside the bar
            barElement.setAttribute = value;
        }, 10);
    }
    
    // Add click event to each character card
    characterCards.forEach(card => {
        card.addEventListener('click', function() {
            // Remove active class from all cards
            characterCards.forEach(c => c.classList.remove('active'));
            
            // Add active class to clicked card
            this.classList.add('active');
            
            // Update the display
            updateCharacterDisplay(this);
        });
    });
    
    // Select button functionality
    selectButton.addEventListener('click', function() {
        const activeCard = document.querySelector('.character-card.active');
        if (activeCard) {
            alert(`You have selected ${activeCard.getAttribute('data-character')}!`);
        } else {
            alert('Please select a character first!');
        }
    });
    
    // Initialize with the first character
    if (characterCards.length > 0) {
        characterCards[0].classList.add('active');
        updateCharacterDisplay(characterCards[0]);
    }
});