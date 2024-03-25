# Slagplan

- Blive færdig med grammar
- Finde ud af om det skal compiles / oversættes
- Eksempel

```c
// Define the input layer, hidden layer and output layer
input = linear (28 * 28, 512);
hidden = linear (512, 300);
output = linear (300, 10);

sequential_model = sequential (input -> ReLU -> hidden -> Sigmoid -> output);

size = 20;
another_model = sequential (linear (28 * 28, size));

loop {
    if size == 10 {
        break;
    }

    another_model = sequential (another_model -> ReLU -> linear (size, size - 1));

    size = size - 1;
}

prediction = model([1, 2, 3, 4, ..., 28 * 28]);

training_data = import MNISTDigits;
test_data = import MNISTDigitsTest;
training_data_labels = import MNISTDigitsLabels;
test_data_labels = import MNISTDigitsTestLabels;

learning_rate = 0.01;

epoch = 0;

// Training sequential model
loop {
    // Create predictions for the entire training set
    train_prediction = sequential_model(training_data);
    // Calculate loss for the predictions
    loss = MSE(train_prediction, training_data_labels);

    // Optimize the model using SGD
    SGD(sequential_model, loss, learning_rate);

    // Test the model
    test_prediction = sequential_model(test_data);
    accuracy = calculate_accuracy(test_prediction, test_data_labels);
    loss = MSE(test_prediction, test_data_labels);
    
    print("Loss: ");
    print(loss);
    print(", Accuracy: ");
    print(accuracy);

    if accuracy > 0.8 or epoch > 10 {
        break;
    }

    epoch = epoch + 1;
}

// Train another model!
loop {
    train_prediction = another_model(training_data);
    loss = MSE(train_prediction, training_data_labels);

    SGD(another_model, loss, learning_rate);

    test_prediction = sequential_model(test_data);
    accuracy = calculate_accuracy(test_prediction, test_data_labels);
    loss = MSE(test_prediction, test_data_labels);
    
    print("Loss: ");
    print(loss);
    print(", Accuracy: ");
    print(accuracy);

    if accuracy > 0.8 or epoch > 10 {
        break;
    }

    epoch = epoch + 1;
}

export sequential_model as "model";
```

# Pinned
- Batches er udskudt pga kompleksitet
- Settings for train loop. Og train loop.
