// $(document).ready(function () {
//     $('.carousel_inner').slick({
//         speed: 1200,
//         adaptiveHeight: true,
//         arrows: true,
//         prevArrow: '<button type="button" class="slick-prev"><img src="img/second/chevron-left-solid.png"></button>',
//         nextArrow: '<button type="button" class="slick-next"><img src="img/second/chevron-right-solid.png"></button>',
//         responsive: [{
//             breakpoint: 992,
//             settings: {
//                 dots: true,
//                 arrows: false
//             }
//         }]

//     });
    
// });
const slider = tns({
    container: '.carousel_inner',
    items: 1,
    slideBy: 'page',
    autoplay: false,
    controls:false,
    nav: false
  });
document.querySelector('.prev').addEventListener( 'click' , function(){ 
  slider.goTo('prev');
});
document.querySelector('.next').addEventListener( 'click' , function(){ 
  slider.goTo('next');
});

