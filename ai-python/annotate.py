import json

def annotate_text(text):
    # Dummy label suggestion
    labels = ["positive", "negative", "neutral"]
    # Return first character based label for example
    return labels[len(text) % 3]

if __name__ == "__main__":
    sample_text = "This is a sample text."
    print("Predicted Label:", annotate_text(sample_text))
