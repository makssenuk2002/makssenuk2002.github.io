function cakes(recipe, available) {
    return Object.keys(recipe).reduce(function(val, ingredient) {
        return Math.min(Math.floor(available[ingredient] / recipe[ingredient] || 0), val)
      }, Infinity)  

}
console.log(cakes({"apples":3,"flour":300,"sugar":150,"milk":100,"oil":100}, {"sugar":500,"flour":2000,"milk":2000} ));