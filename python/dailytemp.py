def dailyTemperatures(temperatures):
    days = [temperatures.pop()]
    print(days)
    count = []
    for x in range(0, len(temperatures)):
        temp = temperatures.pop()
        if days[0] < temp:
            count.append(len(days))
    return count



temperatures = [73,74,75,71,69,72,76,73]
print(dailyTemperatures(temperatures))