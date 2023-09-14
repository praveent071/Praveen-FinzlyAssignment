//json
var obj = {
    id: 2,
    fname: 'praveen'
};
//Dot operator
console.log("\n       ID          =   ".concat(obj.id, "\n       FirstName   =    ").concat(obj.fname, "\n\n"));
//square  operator
console.log("\n      ID   = ".concat([obj.id], "\n"));
//Arrayofobj
var Arrobj = [{
        id: 2,
        fname: 'praveen',
        country: {
            cid: 1,
            cname: 'India'
        }
    },
    {
        id: 3,
        fname: 'arun',
        country: {
            cid: 3,
            cname: 'Japan'
        }
    },
];
for (var i = 0; i <= Arrobj.length; i++) {
    console.log("\n        ID      = ".concat(Arrobj[i].id, "\n        FName   =").concat(Arrobj[i].fname, "\n        Counrty =").concat(Arrobj[i].country.cname, "\n    "));
}
Arrobj.forEach(function (value) {
    console.log(value);
});
