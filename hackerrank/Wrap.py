import textwrap
def wrap(string, max_width):
    return textwrap.fill(string, max_width)

if __name__ == '__main__':
    string, max_width = input("Write some text: "), int(input("Number of columns: "))
    result = wrap(string, max_width)
    print(result)