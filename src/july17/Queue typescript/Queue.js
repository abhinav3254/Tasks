var Queue = /** @class */ (function () {
    function Queue() {
        this.ptr = -1;
        this.arr = [];
    }
    Queue.prototype.isFull = function () {
        if (this.ptr >= 10)
            return false;
        else
            return true;
    };
    Queue.prototype.enqueue = function (value) {
        if (this.isFull()) {
            this.arr[++this.ptr] = value;
        }
        else {
            console.log("Queue is Full");
        }
    };
    Queue.prototype.dequeue = function () {
        if (this.isEmpty()) {
            console.log('Empty Queue');
        }
        else {
            console.log(this.arr[this.ptr--]);
        }
    };
    Queue.prototype.isEmpty = function () {
        if (this.ptr < 0) {
            return true;
        }
        return false;
    };
    return Queue;
}());
var queue = new Queue();
for (var i = 0; i < 12; i++) {
    queue.enqueue(i);
}
for (var i = 0; i < 12; i++) {
    queue.dequeue();
}
