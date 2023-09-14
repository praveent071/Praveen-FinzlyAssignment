"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Square = void 0;
var shape_1 = require("./shape");
var Square = /** @class */ (function (_super) {
    __extends(Square, _super);
    function Square(l) {
        var _this = _super.call(this) || this;
        _this.length = l;
        _this.area = 0;
        return _this;
    }
    Square.prototype.myarea = function () {
        this.area = this.length * this.length;
    };
    Square.prototype.display = function () {
        console.log("\n                ------- Circle Area ----------\n                Length  :: ".concat(this.length, "\n                Area    :: ").concat(this.area, "\n            "));
    };
    return Square;
}(shape_1.Shape));
exports.Square = Square;
