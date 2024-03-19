Test input

m1 = Sigmoid -> 10;

m2 = ReLU -> 20;

m3 = m1 -> m2;

m4 = [m1, m2];

m5 = m3 * 2;

m6 = Sigmoid -> 10 + 2;

m7 = ReLU -> 10 * (2 + 1);

loop {  
   @nbsp accuracy, loss_result = m7(data, SGD);  
    if accuracy <= 0.95 {  
        break;  
    }  
    epoch = epoch + 1;  
}  
