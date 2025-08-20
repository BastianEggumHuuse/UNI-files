import numpy as np

import ast2000tools as ast
import ast2000tools.constants as const
import ast2000tools.utils as utils
import ast2000tools.solar_system as solar


print(f"Astronomical Unit : {const.AU}m")

seed = utils.get_seed("bastiaeh")
system = solar.SolarSystem(seed)

print(f"Star mass : {system.star_mass} solar masses, Star radius : {system.star_radius}")

for planet_idx in range(system.number_of_planets):
    print(f'Planet {planet_idx} is a {system.types[planet_idx]} planet with a semi-major axis of {system.semi_major_axes[planet_idx]} AU, with a mass of {system.masses[planet_idx] * 1.989e+30/5.972e+24}')
    print(f"\n Some sort of info : {system.radii[planet_idx]/6378})")