def les_song_contest(filnavn):
    years = []
    lands = []
    song_contest = {}

    with open(filnavn, 'r') as f:
        for linje in f:
            linje = linje.strip()
            obj1,obj2 = linje.split(" ")
            
            years.append(obj1)
            lands.append(obj2)
    
    for i in range(len(years)):
        song_contest[years[i]] = [lands[i]]
    
    return song_contest

les_song_contest("song_contest.txt")