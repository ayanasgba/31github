def split_and_join(line):
    a = line.split()

    return "-".join(a)

if __name__ == '__main__':
    line = input("Write some text: ")
    result = split_and_join(line)
    print(result)