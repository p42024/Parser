Test input
```python
// This is a comment
/* This is
*  a
*  multi-line
*/ comment

m1 = Sigmoid -> 10;

m2 = ReLU -> 20;

m3 = m1 -> m2;

m4 = [m1, m2];

m5 = m3 * 2;

m6 = Sigmoid -> 10 + 2;

m7 = ReLU -> 10 * ((2 + 1) - 1);

m8 = [m5, m6] * 3;

loop {  
    accuracy, loss_result = m7(data, SGD);  
    if accuracy <= 0.95 {  
        break;  
    } else if epoch = 10 {
        break;
    } 
    epoch = epoch + 1;  
}  
```
