Test input
```python
m1 = linear (5, 3);

m2 = linear (3, 5);

m3 = sequential (m1 -> ReLU -> m2);

m4 = sequential (m3 -> Sigmoid -> linear (4, 3));

m5 = sequential (m3 -> Tanh -> m3);

m6 = recurrent (3, 5, dementia);

m7 = sequential (m5 -> m6);
```
