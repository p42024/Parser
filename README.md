import "/training" as trainingData; 
import "/testing" as testingData; 
import MNIST as model;

func trainModel(model, data) -> { 
    epoch = 0; 
    loop { 
        accuracy, loss = model(data, SGD); 
        if accuracy >= 0.95 { 
            break; 
        } else {
            if epoch > 3 {
                epoch *= 10;
            }
            epoch--; 
            continue; 
        }
        epoch = epoch + 1; 
    }
    return model; 
}

func testModel(model, data) -> {
    accuracy, loss = model(data);
    if accuracy < 0.8 {
        model = trainModel(model, data);
        accuracy = testModel(model, data);
    }
    return accuracy;
}

func createModel(activationFunction, neurons) -> {
    return activationFunction -> neurons;
}

func combineModels(model1, model2) -> {
    return model1 -> model2;
}

func repeatModel(model, times) -> {
    return model * times;
}

//taget fra p4 language example

// Create a 'model' that has 10 neurons and an activation function (ReLU)
m1 = createModel(ReLU, 10);

// Create another model
m2 = createModel(Sigmoid, 20);

// Combine two models
m3 = combineModels(m1, m2);

// Combine two models, but in a different way!
m4 = combineModels(combineModels(m1, m2), combineModels(m1, m2));

m5 = combineModels(repeatModel(m1, 5), repeatModel(m2, 3)); // Equivalent to m1 -> m1 -> m1 -> m1 -> m1 -> m2 -> m2 -> m2

m6 = combineModels(repeatModel(m1, 2), combineModels(repeatModel(m2, 2), repeatModel(m1, 2))); // Equivalent m1 -> m1 -> m2 -> m2 -> m1 -> m1

trainedModel = trainModel(m6, trainingData); 

accuracy = testModel(trainedModel, testingData);

