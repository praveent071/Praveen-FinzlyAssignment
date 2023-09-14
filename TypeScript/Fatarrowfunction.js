var a1 = function () {
    console.log("Good");
};
a1();
var d = function (a, b) {
    console.log("TypeScript " + (a + b));
};
d(12, 5);
var a2 = function () {
    return ("gud");
};
console.log(a2());
var a3 = function (x, y) {
    return (x + y);
};
console.log(a3(2, 5));
//--------------------
var m = function () {
    console.log(3 + 5);
};
var m1 = m();
var n = function (x, y) {
    console.log(x + y);
};
var n1 = n(9, 5);
var o = function () {
    return (6 + 6);
};
var o1 = console.log(o());
var p = function (x, y) {
    return (x + y);
};
var p1 = console.log(p(2, 5));
//---------------
var show = ["praveen", "arun"];
var mm = show.slice(1, 2); //slice
console.log(mm);
var mn = show.splice(1, 0, "efbqbwui"); //splice
show.splice(2, 1);
show.push("uibiweu"); //push
show.push("ifhvbic");
show.push("rfhbwruin");
show.pop(); //pop
show.pop();
var map1 = show.map(function (value) {
    return (value + value);
});
console.log(map1);
console.log(show);
show.forEach(function (aa, i) {
    console.log(aa);
});
