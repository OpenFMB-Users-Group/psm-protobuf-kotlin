// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: breakermodule/breakermodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.breakermodule;

@kotlin.jvm.JvmName("-initializebreakerReading")
public inline fun breakerReading(block: openfmb.breakermodule.BreakerReadingKt.Dsl.() -> kotlin.Unit): openfmb.breakermodule.BreakerReading =
  openfmb.breakermodule.BreakerReadingKt.Dsl._create(openfmb.breakermodule.BreakerReading.newBuilder()).apply { block() }._build()
/**
 * ```
 * MISSING DOCUMENTATION!!!
 * ```
 *
 * Protobuf type `breakermodule.BreakerReading`
 */
public object BreakerReadingKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.breakermodule.BreakerReading.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.breakermodule.BreakerReading.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.breakermodule.BreakerReading = _builder.build()

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
     * `.commonmodule.ReadingMMXU diffReadingMMXU = 2;`
     */
    public var diffReadingMMXU: openfmb.commonmodule.ReadingMMXU
      @JvmName("getDiffReadingMMXU")
      get() = _builder.getDiffReadingMMXU()
      @JvmName("setDiffReadingMMXU")
      set(value) {
        _builder.setDiffReadingMMXU(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMXU diffReadingMMXU = 2;`
     */
    public fun clearDiffReadingMMXU() {
      _builder.clearDiffReadingMMXU()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMXU diffReadingMMXU = 2;`
     * @return Whether the diffReadingMMXU field is set.
     */
    public fun hasDiffReadingMMXU(): kotlin.Boolean {
      return _builder.hasDiffReadingMMXU()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseMMTN phaseMMTN = 3;`
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
     * `.commonmodule.PhaseMMTN phaseMMTN = 3;`
     */
    public fun clearPhaseMMTN() {
      _builder.clearPhaseMMTN()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.PhaseMMTN phaseMMTN = 3;`
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
     * `.commonmodule.ReadingMMTR readingMMTR = 4;`
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
     * `.commonmodule.ReadingMMTR readingMMTR = 4;`
     */
    public fun clearReadingMMTR() {
      _builder.clearReadingMMTR()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMTR readingMMTR = 4;`
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
     * `.commonmodule.ReadingMMXU readingMMXU = 5;`
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
     * `.commonmodule.ReadingMMXU readingMMXU = 5;`
     */
    public fun clearReadingMMXU() {
      _builder.clearReadingMMXU()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.commonmodule.ReadingMMXU readingMMXU = 5;`
     * @return Whether the readingMMXU field is set.
     */
    public fun hasReadingMMXU(): kotlin.Boolean {
      return _builder.hasReadingMMXU()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.breakermodule.BreakerReading.copy(block: openfmb.breakermodule.BreakerReadingKt.Dsl.() -> kotlin.Unit): openfmb.breakermodule.BreakerReading =
  openfmb.breakermodule.BreakerReadingKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.breakermodule.BreakerReadingOrBuilder.conductingEquipmentTerminalReadingOrNull: openfmb.commonmodule.ConductingEquipmentTerminalReading?
  get() = if (hasConductingEquipmentTerminalReading()) getConductingEquipmentTerminalReading() else null

public val openfmb.breakermodule.BreakerReadingOrBuilder.diffReadingMMXUOrNull: openfmb.commonmodule.ReadingMMXU?
  get() = if (hasDiffReadingMMXU()) getDiffReadingMMXU() else null

public val openfmb.breakermodule.BreakerReadingOrBuilder.phaseMMTNOrNull: openfmb.commonmodule.PhaseMMTN?
  get() = if (hasPhaseMMTN()) getPhaseMMTN() else null

public val openfmb.breakermodule.BreakerReadingOrBuilder.readingMMTROrNull: openfmb.commonmodule.ReadingMMTR?
  get() = if (hasReadingMMTR()) getReadingMMTR() else null

public val openfmb.breakermodule.BreakerReadingOrBuilder.readingMMXUOrNull: openfmb.commonmodule.ReadingMMXU?
  get() = if (hasReadingMMXU()) getReadingMMXU() else null

