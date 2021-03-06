package org.pushingpixels.demo.kormorant.svg

import java.awt.*
import java.awt.geom.*
import javax.swing.plaf.UIResource

import org.pushingpixels.neon.icon.IsHiDpiAware
import org.pushingpixels.neon.icon.NeonIcon
import org.pushingpixels.neon.icon.NeonIconUIResource
import org.pushingpixels.neon.icon.ResizableIcon

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
class Preferences_desktop_theme(private var width: Int, private var height: Int) : ResizableIcon, IsHiDpiAware {
	private fun innerPaint(g : Graphics2D) {
        @Suppress("UNUSED_VARIABLE") var shape: Shape?
        @Suppress("UNUSED_VARIABLE") var paint: Paint?
        @Suppress("UNUSED_VARIABLE") var stroke: Stroke?
         
        var origAlpha = 1.0f
        val origComposite = g.composite
        if (origComposite is AlphaComposite) {
            if (origComposite.rule == AlphaComposite.SRC_OVER) {
                origAlpha = origComposite.alpha
            }
        }
        
	    val defaultTransform_ = g.transform
// 
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0
g.composite = AlphaComposite.getInstance(3, 0.54385966f * origAlpha)
val defaultTransform__0_0_0 = g.transform
g.transform(AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, 12.041410446166992f, -9.914664268493652f))
// _0_0_0
paint = RadialGradientPaint(Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, Point2D.Double(17.01475715637207, 39.24955368041992), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, 5.762756045876163E-15f, 19.53350067138672f))
shape = GeneralPath()
shape.moveTo(26.516504, 39.249554)
shape.curveTo(26.53173, 40.959858, 24.724045, 42.543526, 21.777939, 43.40089)
shape.curveTo(18.831835, 44.25826, 15.19768, 44.25826, 12.2515745, 43.40089)
shape.curveTo(9.305469, 42.543526, 7.497783, 40.959858, 7.51301, 39.249554)
shape.curveTo(7.497783, 37.53925, 9.305469, 35.95558, 12.2515745, 35.098217)
shape.curveTo(15.19768, 34.24085, 18.831835, 34.24085, 21.777939, 35.098217)
shape.curveTo(24.724045, 35.95558, 26.53173, 37.53925, 26.516504, 39.249554)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_1
paint = LinearGradientPaint(Point2D.Double(14.883313179016113, 27.847455978393555), Point2D.Double(13.400960922241211, 20.06928062438965), floatArrayOf(0.0f,1.0f), arrayOf(Color(214, 214, 214, 255),Color(240, 240, 240, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f))
shape = GeneralPath()
shape.moveTo(31.205997, 5.2048745)
shape.lineTo(34.908493, 5.2048745)
shape.curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294)
shape.lineTo(44.455605, 29.688444)
shape.curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715)
shape.lineTo(22.638435, 30.660715)
shape.curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444)
shape.lineTo(21.65889, 7.0610294)
shape.curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.205997, 5.2048745)
shape.lineTo(34.908493, 5.2048745)
shape.curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294)
shape.lineTo(44.455605, 29.688444)
shape.curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715)
shape.lineTo(22.638435, 30.660715)
shape.curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444)
shape.lineTo(21.65889, 7.0610294)
shape.curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_1
g.composite = AlphaComposite.getInstance(3, 0.61988306f * origAlpha)
val defaultTransform__0_0_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.363447, 6.0663853)
shape.lineTo(34.751057, 6.0663853)
shape.curveTo(38.672962, 6.0663853, 43.486214, 7.5879025, 43.486214, 7.5879025)
shape.lineTo(43.486214, 29.657421)
shape.curveTo(43.486214, 29.657421, 22.62829, 29.657421, 22.62829, 29.657421)
shape.lineTo(22.62829, 7.5879025)
shape.curveTo(22.62829, 7.5879025, 27.360134, 6.0663853, 31.363447, 6.0663853)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_3
paint = LinearGradientPaint(Point2D.Double(16.940231323242188, 27.853084564208984), Point2D.Double(16.940231323242188, 24.13514518737793), floatArrayOf(0.0f,1.0f), arrayOf(Color(176, 176, 176, 255),Color(147, 147, 147, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f))
shape = GeneralPath()
shape.moveTo(33.410797, 10.508173)
shape.lineTo(30.405594, 17.314075)
shape.lineTo(30.405594, 29.600058)
shape.lineTo(33.587574, 32.428486)
shape.lineTo(36.50439, 29.600058)
shape.lineTo(36.50439, 17.1373)
shape.lineTo(33.410797, 10.508173)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.410797, 10.508173)
shape.lineTo(30.405594, 17.314075)
shape.lineTo(30.405594, 29.600058)
shape.lineTo(33.587574, 32.428486)
shape.lineTo(36.50439, 29.600058)
shape.lineTo(36.50439, 17.1373)
shape.lineTo(33.410797, 10.508173)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_3
g.composite = AlphaComposite.getInstance(3, 0.46783626f * origAlpha)
val defaultTransform__0_0_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_4
paint = LinearGradientPaint(Point2D.Double(17.456695556640625, 37.66166687011719), Point2D.Double(17.456695556640625, 27.231843948364258), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f))
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.4229, 13.510439)
shape.lineTo(31.417679, 17.9217)
shape.lineTo(31.417679, 28.969769)
shape.lineTo(33.551254, 31.023417)
shape.lineTo(35.492302, 28.969769)
shape.lineTo(35.492302, 17.793346)
shape.lineTo(33.4229, 13.510439)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.114439964294434f, -11.15211009979248f))
// _0_0_5
paint = RadialGradientPaint(Point2D.Double(18.16380500793457, 22.53187370300293), 2.842291f, Point2D.Double(18.16380500793457, 22.53187370300293), floatArrayOf(0.0f,1.0f), arrayOf(Color(176, 176, 176, 255),Color(117, 117, 117, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f))
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_6
paint = RadialGradientPaint(Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, Point2D.Double(12.910969734191895, 13.001997947692871), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(201, 201, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, 5.634344100952148f, -15.57903003692627f))
shape = GeneralPath()
shape.moveTo(33.057243, 10.331398)
shape.lineTo(28.01911, 14.132097)
shape.curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585)
shape.curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132)
shape.curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132)
shape.curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825)
shape.curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097)
shape.lineTo(33.057243, 10.331398)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.057243, 10.331398)
shape.lineTo(28.01911, 14.132097)
shape.curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585)
shape.curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132)
shape.curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132)
shape.curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825)
shape.curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097)
shape.lineTo(33.057243, 10.331398)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_7
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(29.915115, 5.0280943)
shape.curveTo(29.915115, 5.0280943, 28.099472, 5.5160723, 28.41988, 6.687217)
shape.curveTo(28.740288, 7.8583636, 31.196747, 9.712676, 31.196747, 9.712676)
shape.lineTo(35.789257, 9.712676)
shape.curveTo(35.789257, 9.712676, 37.89861, 8.15115, 38.138916, 6.9800043)
shape.curveTo(38.379223, 5.8088584, 36.75048, 5.0280943, 36.75048, 5.0280943)
shape.lineTo(29.915115, 5.0280943)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_8
paint = RadialGradientPaint(Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, Point2D.Double(17.09746742248535, 19.777185440063477), floatArrayOf(0.0f,1.0f), arrayOf(Color(139, 139, 139, 255),Color(169, 169, 169, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, 12.436349868774414f, -4.23803186416626f))
shape = GeneralPath()
shape.moveTo(29.73834, 4.055826)
shape.curveTo(29.73834, 4.055826, 27.922695, 4.543804, 28.243105, 5.714949)
shape.curveTo(28.56351, 6.8860955, 31.019972, 8.740409, 31.019972, 8.740409)
shape.lineTo(35.61248, 8.740409)
shape.curveTo(35.61248, 8.740409, 37.721832, 7.178881, 37.96214, 6.007736)
shape.curveTo(38.202446, 4.8365903, 36.573704, 4.055826, 36.573704, 4.055826)
shape.lineTo(29.73834, 4.055826)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_8
g.composite = AlphaComposite.getInstance(3, 0.14035088f * origAlpha)
val defaultTransform__0_0_9 = g.transform
g.transform(AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, 12.041410446166992f, -9.914664268493652f))
// _0_0_9
paint = RadialGradientPaint(Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, Point2D.Double(17.01475715637207, 39.24955368041992), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, 5.762756045876163E-15f, 19.53350067138672f))
shape = GeneralPath()
shape.moveTo(26.516504, 39.249554)
shape.curveTo(26.53173, 40.959858, 24.724045, 42.543526, 21.777939, 43.40089)
shape.curveTo(18.831835, 44.25826, 15.19768, 44.25826, 12.2515745, 43.40089)
shape.curveTo(9.305469, 42.543526, 7.497783, 40.959858, 7.51301, 39.249554)
shape.curveTo(7.497783, 37.53925, 9.305469, 35.95558, 12.2515745, 35.098217)
shape.curveTo(15.19768, 34.24085, 18.831835, 34.24085, 21.777939, 35.098217)
shape.curveTo(24.724045, 35.95558, 26.53173, 37.53925, 26.516504, 39.249554)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_10
paint = LinearGradientPaint(Point2D.Double(14.883313179016113, 27.847455978393555), Point2D.Double(13.400960922241211, 20.06928062438965), floatArrayOf(0.0f,1.0f), arrayOf(Color(80, 121, 173, 255),Color(114, 159, 207, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f))
shape = GeneralPath()
shape.moveTo(31.205997, 5.2048745)
shape.lineTo(34.908493, 5.2048745)
shape.curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294)
shape.lineTo(44.455605, 29.688444)
shape.curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715)
shape.lineTo(22.638435, 30.660715)
shape.curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444)
shape.lineTo(21.65889, 7.0610294)
shape.curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.205997, 5.2048745)
shape.lineTo(34.908493, 5.2048745)
shape.curveTo(39.19495, 5.2048745, 44.455605, 6.5223904, 44.455605, 7.0610294)
shape.lineTo(44.455605, 29.688444)
shape.curveTo(44.455605, 30.227083, 44.018726, 30.660715, 43.476055, 30.660715)
shape.lineTo(22.638435, 30.660715)
shape.curveTo(22.095766, 30.660715, 21.65889, 30.227083, 21.65889, 29.688444)
shape.lineTo(21.65889, 7.0610294)
shape.curveTo(21.65889, 6.5223904, 26.830568, 5.2048745, 31.205997, 5.2048745)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_10
g.composite = AlphaComposite.getInstance(3, 0.26315793f * origAlpha)
val defaultTransform__0_0_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_11
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(31.363447, 6.0663853)
shape.lineTo(34.751057, 6.0663853)
shape.curveTo(38.672962, 6.0663853, 43.486214, 7.5879025, 43.486214, 7.5879025)
shape.lineTo(43.486214, 29.657421)
shape.curveTo(43.486214, 29.657421, 22.62829, 29.657421, 22.62829, 29.657421)
shape.lineTo(22.62829, 7.5879025)
shape.curveTo(22.62829, 7.5879025, 27.360134, 6.0663853, 31.363447, 6.0663853)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_12
paint = Color(117, 80, 123, 255)
shape = GeneralPath()
shape.moveTo(33.410797, 10.508173)
shape.curveTo(33.410797, 10.508173, 30.405594, 15.439076, 30.405594, 17.314075)
shape.lineTo(30.405594, 29.600058)
shape.lineTo(33.587574, 32.428486)
shape.lineTo(36.50439, 29.600058)
shape.lineTo(36.50439, 17.1373)
shape.curveTo(36.50439, 15.3873, 33.410797, 10.508173, 33.410797, 10.508173)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(92, 53, 102, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.410797, 10.508173)
shape.curveTo(33.410797, 10.508173, 30.405594, 15.439076, 30.405594, 17.314075)
shape.lineTo(30.405594, 29.600058)
shape.lineTo(33.587574, 32.428486)
shape.lineTo(36.50439, 29.600058)
shape.lineTo(36.50439, 17.1373)
shape.curveTo(36.50439, 15.3873, 33.410797, 10.508173, 33.410797, 10.508173)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_12
g.composite = AlphaComposite.getInstance(3, 0.25146198f * origAlpha)
val defaultTransform__0_0_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_13
paint = LinearGradientPaint(Point2D.Double(17.456695556640625, 37.66166687011719), Point2D.Double(17.456695556640625, 27.231843948364258), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.998330116271973f, -9.914664268493652f))
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.4229, 13.510439)
shape.lineTo(31.417679, 17.9217)
shape.lineTo(31.417679, 28.969769)
shape.lineTo(33.551254, 31.023417)
shape.lineTo(35.492302, 28.969769)
shape.lineTo(35.492302, 17.793346)
shape.lineTo(33.4229, 13.510439)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 15.114439964294434f, -11.15211009979248f))
// _0_0_14
paint = RadialGradientPaint(Point2D.Double(18.16380500793457, 22.42910385131836), 2.842291f, Point2D.Double(18.16380500793457, 22.42910385131836), floatArrayOf(0.0f,1.0f), arrayOf(Color(117, 80, 123, 255),Color(84, 57, 88, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8709900379180908f, -2.4998940770107683E-15f, 2.150062058256454E-15f, 1.6091660261154175f, -15.820500373840332f, -13.547989845275879f))
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(92, 53, 102, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_15
paint = RadialGradientPaint(Point2D.Double(27.848600387573242, 4.607162952423096), 7.488951f, Point2D.Double(27.848600387573242, 4.607162952423096), floatArrayOf(0.0f,1.0f), arrayOf(Color(200, 213, 230, 255),Color(66, 126, 191, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.8339279890060425f, 2.121324062347412f, 0.6557289958000183f))
shape = GeneralPath()
shape.moveTo(33.057243, 10.331398)
shape.lineTo(28.01911, 14.132097)
shape.curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585)
shape.curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132)
shape.curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132)
shape.curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825)
shape.curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097)
shape.lineTo(33.057243, 10.331398)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(52, 101, 164, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(33.057243, 10.331398)
shape.lineTo(28.01911, 14.132097)
shape.curveTo(28.01911, 14.132097, 26.162954, 8.565209, 26.162954, 6.0887585)
shape.curveTo(26.162954, 3.6138842, 27.48878, 2.6416132, 28.902992, 2.6416132)
shape.curveTo(28.902992, 2.6416132, 37.299885, 2.6416132, 37.299885, 2.6416132)
shape.curveTo(38.256462, 2.6416132, 39.92944, 3.0393603, 40.12831, 5.9119825)
shape.curveTo(40.327187, 8.784603, 38.095383, 14.132097, 38.095383, 14.132097)
shape.lineTo(33.057243, 10.331398)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_0_15
g.composite = AlphaComposite.getInstance(3, 0.33333334f * origAlpha)
val defaultTransform__0_0_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_16
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(29.915115, 5.0280943)
shape.curveTo(29.915115, 5.0280943, 28.099472, 5.5160723, 28.41988, 6.687217)
shape.curveTo(28.740288, 7.8583636, 30.696747, 9.712676, 31.196747, 9.712676)
shape.lineTo(35.789257, 9.712676)
shape.curveTo(36.539257, 9.650176, 37.89861, 8.15115, 38.138916, 6.9800043)
shape.curveTo(38.379223, 5.8088584, 36.75048, 5.0280943, 36.75048, 5.0280943)
shape.lineTo(29.915115, 5.0280943)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_16
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_0_17 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_17
paint = RadialGradientPaint(Point2D.Double(30.974437713623047, 12.172572135925293), 4.890574f, Point2D.Double(30.974437713623047, 12.172572135925293), floatArrayOf(0.0f,1.0f), arrayOf(Color(32, 74, 135, 255),Color(20, 46, 85, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(2.132075071334839f, -4.7341581982461144E-15f, 2.2673780272753057E-15f, 1.0211360454559326f, -32.94403839111328f, -3.6894469261169434f))
shape = GeneralPath()
shape.moveTo(29.73834, 4.055826)
shape.curveTo(29.23834, 4.055826, 27.922695, 4.543804, 28.243105, 5.714949)
shape.curveTo(28.56351, 6.8860955, 30.14274, 8.740409, 31.019972, 8.740409)
shape.lineTo(35.61248, 8.740409)
shape.curveTo(36.30282, 8.740409, 37.721832, 7.178881, 37.96214, 6.007736)
shape.curveTo(38.202446, 4.8365903, 37.073704, 4.055826, 36.573704, 4.055826)
shape.lineTo(29.73834, 4.055826)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_17
g.composite = AlphaComposite.getInstance(3, 0.28654972f * origAlpha)
val defaultTransform__0_0_18 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_18
paint = LinearGradientPaint(Point2D.Double(31.643028259277344, 13.61693286895752), Point2D.Double(31.643028259277344, 9.63847541809082), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.121324062347412f, -0.8838850259780884f))
shape = GeneralPath()
shape.moveTo(33.145634, 9.68365)
shape.lineTo(37.83022, 13.219183)
shape.lineTo(39.067654, 9.772038)
shape.lineTo(37.565052, 12.246911)
shape.lineTo(33.145634, 9.68365)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_18
g.composite = AlphaComposite.getInstance(3, 0.28654972f * origAlpha)
val defaultTransform__0_0_19 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_0_19
paint = LinearGradientPaint(Point2D.Double(31.643028259277344, 13.61693286895752), Point2D.Double(31.643028259277344, 9.63847541809082), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 2.121324062347412f, -0.8838850259780884f))
shape = GeneralPath()
shape.moveTo(32.79208, 9.860426)
shape.lineTo(28.372663, 13.219183)
shape.lineTo(26.870062, 6.5900598)
shape.lineTo(28.902992, 11.981746)
shape.lineTo(32.79208, 9.860426)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_0_19
g.transform = defaultTransform__0_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1
g.composite = AlphaComposite.getInstance(3, 0.54385966f * origAlpha)
val defaultTransform__0_1_0 = g.transform
g.transform(AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, -6.0782389640808105f, 3.005204916000366f))
// _0_1_0
paint = RadialGradientPaint(Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, Point2D.Double(17.01475715637207, 39.24955368041992), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, -2.992396937268808E-15f, 19.53350067138672f))
shape = GeneralPath()
shape.moveTo(26.516504, 39.249554)
shape.curveTo(26.53173, 40.959858, 24.724045, 42.543526, 21.777939, 43.40089)
shape.curveTo(18.831835, 44.25826, 15.19768, 44.25826, 12.2515745, 43.40089)
shape.curveTo(9.305469, 42.543526, 7.497783, 40.959858, 7.51301, 39.249554)
shape.curveTo(7.497783, 37.53925, 9.305469, 35.95558, 12.2515745, 35.098217)
shape.curveTo(15.19768, 34.24085, 18.831835, 34.24085, 21.777939, 35.098217)
shape.curveTo(24.724045, 35.95558, 26.53173, 37.53925, 26.516504, 39.249554)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_0
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_1 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_1
paint = LinearGradientPaint(Point2D.Double(14.883313179016113, 27.847455978393555), Point2D.Double(13.400960922241211, 20.06928062438965), floatArrayOf(0.0f,1.0f), arrayOf(Color(214, 214, 214, 255),Color(240, 240, 240, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f))
shape = GeneralPath()
shape.moveTo(13.086385, 18.12474)
shape.lineTo(16.78888, 18.12474)
shape.curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894)
shape.lineTo(26.33599, 42.60831)
shape.curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058)
shape.lineTo(4.5188212, 43.58058)
shape.curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831)
shape.lineTo(3.5392747, 19.980894)
shape.curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(13.086385, 18.12474)
shape.lineTo(16.78888, 18.12474)
shape.curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894)
shape.lineTo(26.33599, 42.60831)
shape.curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058)
shape.lineTo(4.5188212, 43.58058)
shape.curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831)
shape.lineTo(3.5392747, 19.980894)
shape.curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_1
g.composite = AlphaComposite.getInstance(3, 0.61988306f * origAlpha)
val defaultTransform__0_1_2 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_2
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(13.243834, 18.986252)
shape.lineTo(16.631443, 18.986252)
shape.curveTo(20.55335, 18.986252, 25.3666, 20.507769, 25.3666, 20.507769)
shape.lineTo(25.3666, 42.57729)
shape.curveTo(25.3666, 42.57729, 4.508677, 42.57729, 4.508677, 42.57729)
shape.lineTo(4.508677, 20.507769)
shape.curveTo(4.508677, 20.507769, 9.2405205, 18.986252, 13.243834, 18.986252)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_2
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_3 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_3
paint = LinearGradientPaint(Point2D.Double(16.940231323242188, 27.853084564208984), Point2D.Double(16.940231323242188, 24.13514518737793), floatArrayOf(0.0f,1.0f), arrayOf(Color(176, 176, 176, 255),Color(147, 147, 147, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f))
shape = GeneralPath()
shape.moveTo(15.291184, 23.42804)
shape.lineTo(12.285981, 30.233944)
shape.lineTo(12.285981, 42.519924)
shape.lineTo(15.467961, 45.34835)
shape.lineTo(18.384777, 42.519924)
shape.lineTo(18.384777, 30.057167)
shape.lineTo(15.291184, 23.42804)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.291184, 23.42804)
shape.lineTo(12.285981, 30.233944)
shape.lineTo(12.285981, 42.519924)
shape.lineTo(15.467961, 45.34835)
shape.lineTo(18.384777, 42.519924)
shape.lineTo(18.384777, 30.057167)
shape.lineTo(15.291184, 23.42804)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_3
g.composite = AlphaComposite.getInstance(3, 0.46783626f * origAlpha)
val defaultTransform__0_1_4 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_4
paint = LinearGradientPaint(Point2D.Double(17.456695556640625, 37.66166687011719), Point2D.Double(17.456695556640625, 27.231843948364258), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f))
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.303288, 26.430305)
shape.lineTo(13.298065, 30.841566)
shape.lineTo(13.298065, 41.889637)
shape.lineTo(15.431641, 43.943283)
shape.lineTo(17.372688, 41.889637)
shape.lineTo(17.372688, 30.713213)
shape.lineTo(15.303288, 26.430305)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_4
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_5 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.0052080154418945f, 1.7677680253982544f))
// _0_1_5
paint = RadialGradientPaint(Point2D.Double(18.16380500793457, 22.53187370300293), 2.842291f, Point2D.Double(18.16380500793457, 22.53187370300293), floatArrayOf(0.0f,1.0f), arrayOf(Color(176, 176, 176, 255),Color(117, 117, 117, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f))
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_5
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_6 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_6
paint = RadialGradientPaint(Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, Point2D.Double(12.910969734191895, 13.001997947692871), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(201, 201, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, -12.485250473022461f, -2.6591429710388184f))
shape = GeneralPath()
shape.moveTo(14.937632, 23.251265)
shape.lineTo(9.899495, 27.051964)
shape.curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623)
shape.curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479)
shape.curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479)
shape.curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848)
shape.curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964)
shape.lineTo(14.937632, 23.251265)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(14.937632, 23.251265)
shape.lineTo(9.899495, 27.051964)
shape.curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623)
shape.curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479)
shape.curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479)
shape.curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848)
shape.curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964)
shape.lineTo(14.937632, 23.251265)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_6
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_7 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_7
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(11.795503, 17.94796)
shape.curveTo(11.795503, 17.94796, 9.979857, 18.435938, 10.300266, 19.607082)
shape.curveTo(10.620674, 20.778229, 13.077134, 22.632542, 13.077134, 22.632542)
shape.lineTo(17.669645, 22.632542)
shape.curveTo(17.669645, 22.632542, 19.778996, 21.071014, 20.019302, 19.89987)
shape.curveTo(20.259607, 18.728724, 18.630869, 17.94796, 18.630869, 17.94796)
shape.lineTo(11.795503, 17.94796)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_7
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_8 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_8
paint = RadialGradientPaint(Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, Point2D.Double(17.09746742248535, 19.777185440063477), floatArrayOf(0.0f,1.0f), arrayOf(Color(139, 139, 139, 255),Color(169, 169, 169, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, -5.683291912078857f, 8.681835174560547f))
shape = GeneralPath()
shape.moveTo(11.618727, 16.975693)
shape.curveTo(11.618727, 16.975693, 9.8030815, 17.46367, 10.12349, 18.634815)
shape.curveTo(10.443897, 19.805962, 12.900358, 21.660275, 12.900358, 21.660275)
shape.lineTo(17.492868, 21.660275)
shape.curveTo(17.492868, 21.660275, 19.602219, 20.098747, 19.842525, 18.927603)
shape.curveTo(20.082832, 17.756456, 18.454092, 16.975693, 18.454092, 16.975693)
shape.lineTo(11.618727, 16.975693)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_8
g.composite = AlphaComposite.getInstance(3, 0.14035088f * origAlpha)
val defaultTransform__0_1_9 = g.transform
g.transform(AffineTransform(1.232558012008667f, 0.0f, 0.0f, 1.0f, -6.0782389640808105f, 3.005204916000366f))
// _0_1_9
paint = RadialGradientPaint(Point2D.Double(17.01475715637207, 39.24955368041992), 9.501747f, Point2D.Double(17.01475715637207, 39.24955368041992), floatArrayOf(0.0f,1.0f), arrayOf(Color(0, 0, 0, 255),Color(0, 0, 0, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.5023260116577148f, -2.992396937268808E-15f, 19.53350067138672f))
shape = GeneralPath()
shape.moveTo(26.516504, 39.249554)
shape.curveTo(26.53173, 40.959858, 24.724045, 42.543526, 21.777939, 43.40089)
shape.curveTo(18.831835, 44.25826, 15.19768, 44.25826, 12.2515745, 43.40089)
shape.curveTo(9.305469, 42.543526, 7.497783, 40.959858, 7.51301, 39.249554)
shape.curveTo(7.497783, 37.53925, 9.305469, 35.95558, 12.2515745, 35.098217)
shape.curveTo(15.19768, 34.24085, 18.831835, 34.24085, 21.777939, 35.098217)
shape.curveTo(24.724045, 35.95558, 26.53173, 37.53925, 26.516504, 39.249554)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_9
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_10 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_10
paint = LinearGradientPaint(Point2D.Double(14.883313179016113, 27.847455978393555), Point2D.Double(13.400960922241211, 20.06928062438965), floatArrayOf(0.0f,1.0f), arrayOf(Color(214, 214, 214, 255),Color(240, 240, 240, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f))
shape = GeneralPath()
shape.moveTo(13.086385, 18.12474)
shape.lineTo(16.78888, 18.12474)
shape.curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894)
shape.lineTo(26.33599, 42.60831)
shape.curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058)
shape.lineTo(4.5188212, 43.58058)
shape.curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831)
shape.lineTo(3.5392747, 19.980894)
shape.curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0000001f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(13.086385, 18.12474)
shape.lineTo(16.78888, 18.12474)
shape.curveTo(21.075336, 18.12474, 26.33599, 19.442257, 26.33599, 19.980894)
shape.lineTo(26.33599, 42.60831)
shape.curveTo(26.33599, 43.14695, 25.899113, 43.58058, 25.356443, 43.58058)
shape.lineTo(4.5188212, 43.58058)
shape.curveTo(3.9761531, 43.58058, 3.5392747, 43.14695, 3.5392747, 42.60831)
shape.lineTo(3.5392747, 19.980894)
shape.curveTo(3.5392747, 19.442257, 8.710954, 18.12474, 13.086385, 18.12474)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_10
g.composite = AlphaComposite.getInstance(3, 0.61988306f * origAlpha)
val defaultTransform__0_1_11 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_11
paint = Color(255, 255, 255, 255)
stroke = BasicStroke(1.0f,0,1,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(13.243834, 18.986252)
shape.lineTo(16.631443, 18.986252)
shape.curveTo(20.55335, 18.986252, 25.3666, 20.507769, 25.3666, 20.507769)
shape.lineTo(25.3666, 42.57729)
shape.curveTo(25.3666, 42.57729, 4.508677, 42.57729, 4.508677, 42.57729)
shape.lineTo(4.508677, 20.507769)
shape.curveTo(4.508677, 20.507769, 9.2405205, 18.986252, 13.243834, 18.986252)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_11
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_12 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_12
paint = LinearGradientPaint(Point2D.Double(15.335378646850586, 28.37778663635254), Point2D.Double(15.335378646850586, 34.3881950378418), floatArrayOf(0.0f,1.0f), arrayOf(Color(85, 87, 83, 255),Color(124, 127, 121, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
shape = GeneralPath()
shape.moveTo(15.291184, 23.42804)
shape.curveTo(15.291184, 23.42804, 12.285981, 27.845821, 12.285981, 30.233944)
shape.lineTo(12.285981, 42.519924)
shape.lineTo(15.467961, 45.34835)
shape.lineTo(18.384777, 42.519924)
shape.lineTo(18.384777, 30.057167)
shape.curveTo(18.384777, 28.057167, 15.291184, 23.42804, 15.291184, 23.42804)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(46, 52, 54, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.291184, 23.42804)
shape.curveTo(15.291184, 23.42804, 12.285981, 27.845821, 12.285981, 30.233944)
shape.lineTo(12.285981, 42.519924)
shape.lineTo(15.467961, 45.34835)
shape.lineTo(18.384777, 42.519924)
shape.lineTo(18.384777, 30.057167)
shape.curveTo(18.384777, 28.057167, 15.291184, 23.42804, 15.291184, 23.42804)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_12
g.composite = AlphaComposite.getInstance(3, 0.46783626f * origAlpha)
val defaultTransform__0_1_13 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_13
paint = LinearGradientPaint(Point2D.Double(17.456695556640625, 37.66166687011719), Point2D.Double(17.456695556640625, 27.231843948364258), floatArrayOf(0.0f,1.0f), arrayOf(Color(255, 255, 255, 255),Color(255, 255, 255, 0)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.121319055557251f, 3.005204916000366f))
stroke = BasicStroke(0.99999976f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(15.303288, 26.430305)
shape.lineTo(13.298065, 30.841566)
shape.lineTo(13.298065, 41.889637)
shape.lineTo(15.431641, 43.943283)
shape.lineTo(17.372688, 41.889637)
shape.lineTo(17.372688, 30.713213)
shape.lineTo(15.303288, 26.430305)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_13
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_14 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -3.0052080154418945f, 1.7677680253982544f))
// _0_1_14
paint = RadialGradientPaint(Point2D.Double(18.16380500793457, 22.22356414794922), 2.842291f, Point2D.Double(18.16380500793457, 22.22356414794922), floatArrayOf(0.0f,1.0f), arrayOf(Color(128, 131, 125, 255),Color(76, 77, 74, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.0f, 0.0f, 0.0f, 0.86006098985672f, 0.0f, 3.2537600994110107f))
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(46, 52, 54, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(20.506096, 23.251263)
shape.curveTo(20.50985, 23.948053, 20.064234, 24.59325, 19.337984, 24.942549)
shape.curveTo(18.611736, 25.291845, 17.715874, 25.291845, 16.989626, 24.942549)
shape.curveTo(16.263376, 24.59325, 15.81776, 23.948053, 15.821514, 23.251263)
shape.curveTo(15.81776, 22.554472, 16.263376, 21.909275, 16.989626, 21.559977)
shape.curveTo(17.715874, 21.21068, 18.611736, 21.21068, 19.337984, 21.559977)
shape.curveTo(20.064234, 21.909275, 20.50985, 22.554472, 20.506096, 23.251263)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_14
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_15 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_15
paint = RadialGradientPaint(Point2D.Double(12.910969734191895, 13.001997947692871), 7.488951f, Point2D.Double(12.910969734191895, 13.001997947692871), floatArrayOf(0.0f,1.0f), arrayOf(Color(240, 240, 240, 255),Color(201, 201, 201, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.8027249574661255f, 2.307501924799594E-23f, -2.6369310276807938E-23f, 1.5033420324325562f, -12.485250473022461f, -2.6591429710388184f))
shape = GeneralPath()
shape.moveTo(14.937632, 23.251265)
shape.lineTo(9.899495, 27.051964)
shape.curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623)
shape.curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479)
shape.curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479)
shape.curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848)
shape.curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964)
shape.lineTo(14.937632, 23.251265)
shape.closePath()
g.paint = paint
g.fill(shape)
paint = Color(148, 148, 148, 255)
stroke = BasicStroke(1.0f,0,0,4.0f,null,0.0f)
shape = GeneralPath()
shape.moveTo(14.937632, 23.251265)
shape.lineTo(9.899495, 27.051964)
shape.curveTo(9.899495, 27.051964, 8.04334, 21.485075, 8.04334, 19.008623)
shape.curveTo(8.043341, 16.53375, 9.369165, 15.561479, 10.78338, 15.561479)
shape.curveTo(10.78338, 15.561479, 19.180273, 15.561479, 19.180273, 15.561479)
shape.curveTo(20.13685, 15.561479, 21.809826, 15.959226, 22.0087, 18.831848)
shape.curveTo(22.207575, 21.70447, 19.975767, 27.051964, 19.975767, 27.051964)
shape.lineTo(14.937632, 23.251265)
shape.closePath()
g.paint = paint
g.stroke = stroke
g.draw(shape)
g.transform = defaultTransform__0_1_15
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_16 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_16
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(11.795503, 17.94796)
shape.curveTo(11.795503, 17.94796, 9.979857, 18.435938, 10.300266, 19.607082)
shape.curveTo(10.620674, 20.778229, 12.007307, 22.632542, 13.077134, 22.632542)
shape.lineTo(17.669645, 22.632542)
shape.curveTo(18.546875, 22.632542, 19.778996, 21.071014, 20.019302, 19.89987)
shape.curveTo(20.259607, 18.728724, 18.630869, 17.94796, 18.630869, 17.94796)
shape.lineTo(11.795503, 17.94796)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_16
g.composite = AlphaComposite.getInstance(3, 1.0f * origAlpha)
val defaultTransform__0_1_17 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_17
paint = RadialGradientPaint(Point2D.Double(17.09746742248535, 19.777185440063477), 4.5473714f, Point2D.Double(17.09746742248535, 19.777185440063477), floatArrayOf(0.0f,1.0f), arrayOf(Color(139, 139, 139, 255),Color(169, 169, 169, 255)), MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, AffineTransform(1.2083330154418945f, 0.0f, 0.0f, 0.6364930272102356f, -5.683291912078857f, 8.681835174560547f))
shape = GeneralPath()
shape.moveTo(11.618727, 16.975693)
shape.curveTo(11.618727, 16.975693, 9.8030815, 17.46367, 10.12349, 18.634815)
shape.curveTo(10.443897, 19.805962, 11.775358, 21.660275, 12.900358, 21.660275)
shape.lineTo(17.492868, 21.660275)
shape.curveTo(18.242868, 21.660275, 19.602219, 20.098747, 19.842525, 18.927603)
shape.curveTo(20.082832, 17.756456, 18.454092, 16.975693, 18.454092, 16.975693)
shape.lineTo(11.618727, 16.975693)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_17
g.composite = AlphaComposite.getInstance(3, 0.61988306f * origAlpha)
val defaultTransform__0_1_18 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_18
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(14.937632, 22.720934)
shape.lineTo(19.622215, 26.256468)
shape.lineTo(20.859652, 22.809322)
shape.lineTo(19.35705, 25.284197)
shape.lineTo(14.937632, 22.720934)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_18
g.composite = AlphaComposite.getInstance(3, 0.61988306f * origAlpha)
val defaultTransform__0_1_19 = g.transform
g.transform(AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f))
// _0_1_19
paint = Color(255, 255, 255, 255)
shape = GeneralPath()
shape.moveTo(14.584078, 22.89771)
shape.lineTo(10.164659, 26.256468)
shape.lineTo(8.662058, 19.627342)
shape.lineTo(10.69499, 25.019032)
shape.lineTo(14.584078, 22.89771)
shape.closePath()
g.paint = paint
g.fill(shape)
g.transform = defaultTransform__0_1_19
g.transform = defaultTransform__0_1
g.transform = defaultTransform__0
g.transform = defaultTransform_

	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 3.0392746925354004
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.141613245010376
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 41.91632843017578
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 45.121849060058594
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        fun of(width: Int, height: Int): NeonIcon {
            return NeonIcon(Preferences_desktop_theme(width, height))
        }

        /**
         * Returns a new [UIResource] instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new [UIResource] instance of this icon with specified dimensions.
         */
        fun uiResourceOf(width: Int, height: Int): NeonIconUIResource {
            return NeonIconUIResource(Preferences_desktop_theme(width, height))
        }
    }

    override fun getIconHeight(): Int {
        return width
    }

    override fun getIconWidth(): Int {
        return height
    }

    override fun setDimension(newDimension: Dimension) {
        width = newDimension.width
        height = newDimension.height
    }

    override fun isHiDpiAware(): Boolean {
        return true
    }

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON)
        g2d.translate(x, y)

        val coef1 = this.width.toDouble() / getOrigWidth()
        val coef2 = this.height.toDouble() / getOrigHeight()
        val coef = Math.min(coef1, coef2)
        g2d.clipRect(0, 0, this.width, this.height)
        g2d.scale(coef, coef)
        g2d.translate(-getOrigX(), -getOrigY())
        if (coef1 != coef2) {
            if (coef1 < coef2) {
                val extraDy = ((getOrigWidth() - getOrigHeight()) / 2.0).toInt()
                g2d.translate(0, extraDy)
            } else {
                val extraDx = ((getOrigHeight() - getOrigWidth()) / 2.0).toInt()
                g2d.translate(extraDx, 0)
            }
        }
        val g2ForInner = g2d.create() as Graphics2D
        innerPaint(g2ForInner)
        g2ForInner.dispose()
        g2d.dispose()

    }
}

