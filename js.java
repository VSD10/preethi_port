<script>
  let currentSlide = 0;

  function moveSlide(direction) {
    const track = document.getElementById('track');
    const slides = document.querySelectorAll('.project-card');
    const totalSlides = slides.length;

    // Update the index
    currentSlide += direction;

    // Loop logic
    if (currentSlide >= totalSlides) {
      currentSlide = 0; // Go back to first slide
    } else if (currentSlide < 0) {
      currentSlide = totalSlides - 1; // Go to last slide
    }

    // Calculate displacement
    // We move the track left by (index * 100) percent
    const offset = -(currentSlide * 100);
    track.style.transform = `translateX(${offset}%)`;
  }
</script>

