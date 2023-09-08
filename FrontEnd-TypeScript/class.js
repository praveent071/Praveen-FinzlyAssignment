"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.show = exports.obj = exports.MyClass = void 0;
var MyClass = /** @class */ (function () {
    function MyClass(id, name, age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    MyClass.prototype.display = function () {
        console.log("\n         ID         =  ".concat(this.id, "\n         Name       =  ").concat(this.name, "\n         Age        =  ").concat(this.age, "\n\n        "));
    };
    return MyClass;
}());
exports.MyClass = MyClass;
exports.obj = new MyClass(1, "praveen", 22);
exports.obj.display();
exports.show = ["praveen", "arun"];
