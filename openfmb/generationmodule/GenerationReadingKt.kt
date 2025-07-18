// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: generationmodule/generationmodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.generationmodule;

@kotlin.jvm.JvmName("-initializegenerationReading")
public inline fun generationReading(block: openfmb.generationmodule.GenerationReadingKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationReading =
  openfmb.generationmodule.GenerationReadingKt.Dsl._create(openfmb.generationmodule.GenerationReading.newBuilder()).apply { block() }._build()
/**
 * ```
 * Generation reading value
 * ```
 *
 * Protobuf type `generationmodule.GenerationReading`
 */
public object GenerationReadingKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.generationmodule.GenerationReading.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.generationmodule.GenerationReading.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.generationmodule.GenerationReading = _builder.build()

    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ConductingEquipmentTerminalReading conductingEquipmentTerminalReading = 1 [(.uml.option_parent_message) = true];`
     */
    public var conductingEquipmentTerminalReading: openfmb.commonmodule.ConductingEquipmentTerminalReading
      @JvmName("getConductingEquipmentTerminalReading")
      get() = _builder.getConductingEquipmentTerminalReading()
      @JvmName("setConductingEquipmentTerminalReading")
      set(value) {
        _builder.setConductingEquipmentTerminalReading(value)
      }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ConductingEquipmentTerminalReading conductingEquipmentTerminalReading = 1 [(.uml.option_parent_message) = true];`
     */
    public fun clearConductingEquipmentTerminalReading() {
      _builder.clearConductingEquipmentTerminalReading()
    }
    /**
     * ```
     * UML inherited base object
     * ```
     *
     * `.commonmodule.ConductingEquipmentTerminalReading conductingEquipmentTerminalReading = 1 [(.uml.option_parent_message) = true];`
     * @return Whether the conductingEquipmentTerminalReading field is set.
     */
    public fun hasConductingEquipmentTerminalReading(): kotlin.Boolean {
      return _builder.hasConductingEquipmentTerminalReading()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseMMTN phaseMMTN = 2;`
     */
    public var phaseMMTN: openfmb.commonmodule.PhaseMMTN
      @JvmName("getPhaseMMTN")
      get() = _builder.getPhaseMMTN()
      @JvmName("setPhaseMMTN")
      set(value) {
        _builder.setPhaseMMTN(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseMMTN phaseMMTN = 2;`
     */
    public fun clearPhaseMMTN() {
      _builder.clearPhaseMMTN()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseMMTN phaseMMTN = 2;`
     * @return Whether the phaseMMTN field is set.
     */
    public fun hasPhaseMMTN(): kotlin.Boolean {
      return _builder.hasPhaseMMTN()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMTR readingMMTR = 3;`
     */
    public var readingMMTR: openfmb.commonmodule.ReadingMMTR
      @JvmName("getReadingMMTR")
      get() = _builder.getReadingMMTR()
      @JvmName("setReadingMMTR")
      set(value) {
        _builder.setReadingMMTR(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMTR readingMMTR = 3;`
     */
    public fun clearReadingMMTR() {
      _builder.clearReadingMMTR()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMTR readingMMTR = 3;`
     * @return Whether the readingMMTR field is set.
     */
    public fun hasReadingMMTR(): kotlin.Boolean {
      return _builder.hasReadingMMTR()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMXU readingMMXU = 4;`
     */
    public var readingMMXU: openfmb.commonmodule.ReadingMMXU
      @JvmName("getReadingMMXU")
      get() = _builder.getReadingMMXU()
      @JvmName("setReadingMMXU")
      set(value) {
        _builder.setReadingMMXU(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMXU readingMMXU = 4;`
     */
    public fun clearReadingMMXU() {
      _builder.clearReadingMMXU()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMXU readingMMXU = 4;`
     * @return Whether the readingMMXU field is set.
     */
    public fun hasReadingMMXU(): kotlin.Boolean {
      return _builder.hasReadingMMXU()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.generationmodule.GenerationReading.copy(block: openfmb.generationmodule.GenerationReadingKt.Dsl.() -> kotlin.Unit): openfmb.generationmodule.GenerationReading =
  openfmb.generationmodule.GenerationReadingKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.generationmodule.GenerationReadingOrBuilder.conductingEquipmentTerminalReadingOrNull: openfmb.commonmodule.ConductingEquipmentTerminalReading?
  get() = if (hasConductingEquipmentTerminalReading()) getConductingEquipmentTerminalReading() else null

public val openfmb.generationmodule.GenerationReadingOrBuilder.phaseMMTNOrNull: openfmb.commonmodule.PhaseMMTN?
  get() = if (hasPhaseMMTN()) getPhaseMMTN() else null

public val openfmb.generationmodule.GenerationReadingOrBuilder.readingMMTROrNull: openfmb.commonmodule.ReadingMMTR?
  get() = if (hasReadingMMTR()) getReadingMMTR() else null

public val openfmb.generationmodule.GenerationReadingOrBuilder.readingMMXUOrNull: openfmb.commonmodule.ReadingMMXU?
  get() = if (hasReadingMMXU()) getReadingMMXU() else null

