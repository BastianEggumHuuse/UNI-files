# - enkel_tegning.py - 03.08: Enkel tegning

from ezgraphics import GraphicsWindow




win = GraphicsWindow()

canvas = win.canvas()

canvas.drawRectangle(20, 20, 100, 75)

win.wait()
