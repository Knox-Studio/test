import random

def print_heart():
    # Outer loop for the vertical space of the heart
    for row in range(6):
        for col in range(7):
            # Conditions to print '*' for heart shape
            if (row == 0 and col % 3 != 0) or \
               (row == 1 and col % 3 == 0) or \
               (row - col == 2) or \
               (row + col == 8):
                print("*", end="")
            else:
                print(" ", end="")
        print()

def generate_romantic_quote():
    quotes = [
        "You are the reason I believe in love.",
        "I could search my whole life through and through and never find another you.",
        "I love you more than words can show.",
        "You’re the best thing I never knew I needed.",
        "In you, I’ve found the love of my life and my closest, truest friend."
    ]
    return random.choice(quotes)

# Print the heart pattern
print_heart()

# Generate and print a romantic quote
print("\n" + generate_romantic_quote())
