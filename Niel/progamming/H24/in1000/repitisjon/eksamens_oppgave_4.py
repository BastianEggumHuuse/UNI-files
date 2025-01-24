def lag_interessegrupper(personers_interesser):
    interesse_gruppe = {}

    for navn in personers_interesser.keys():
        interesse = personers_interesser[navn]
        if interesse not in interesse_gruppe.keys():
            interesse_gruppe[interesse] = [navn]
        else:
            interesse_gruppe[interesse].append(navn)
    return interesse_gruppe