class Queue<T> {
    private arr:T[];
    private ptr : number = -1;

    constructor () {
        this.arr = [];
    }

    private isFull() : boolean {
        if (this.ptr >= 10)
        return false;
        else 
        return true;
    }

    public enqueue (value:T) : void {
        if (this.isFull()) {
            this.arr[++this.ptr] = value; 
        } else {
            console.log("Queue is Full")
        }
    }

    public dequeue(): void {
        if (this.isEmpty()) {
            console.log('Empty Queue');
        } else {
            console.log(this.arr[this.ptr--]);
        }
    }

    private isEmpty() : boolean {
        if (this.ptr < 0) {
            return true;
        }
        return false;
    }
}

let queue = new Queue<Number>();

for (let i = 0;i<12;i++) {
    queue.enqueue(i);
}
for (let i = 0;i<12;i++) {
    queue.dequeue();
}