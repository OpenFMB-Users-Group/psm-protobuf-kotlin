// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: reservemodule/reservemodule.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package openfmb.reservemodule;

@kotlin.jvm.JvmName("-initializereserveAvailability")
public inline fun reserveAvailability(block: openfmb.reservemodule.ReserveAvailabilityKt.Dsl.() -> kotlin.Unit): openfmb.reservemodule.ReserveAvailability =
  openfmb.reservemodule.ReserveAvailabilityKt.Dsl._create(openfmb.reservemodule.ReserveAvailability.newBuilder()).apply { block() }._build()
/**
 * ```
 * MISSING DOCUMENTATION!!!
 * ```
 *
 * Protobuf type `reservemodule.ReserveAvailability`
 */
public object ReserveAvailabilityKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: openfmb.reservemodule.ReserveAvailability.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: openfmb.reservemodule.ReserveAvailability.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): openfmb.reservemodule.ReserveAvailability = _builder.build()

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin incrementalMargin = 1;`
     */
    public var incrementalMargin: openfmb.reservemodule.ReserveMargin
      @JvmName("getIncrementalMargin")
      get() = _builder.getIncrementalMargin()
      @JvmName("setIncrementalMargin")
      set(value) {
        _builder.setIncrementalMargin(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin incrementalMargin = 1;`
     */
    public fun clearIncrementalMargin() {
      _builder.clearIncrementalMargin()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin incrementalMargin = 1;`
     * @return Whether the incrementalMargin field is set.
     */
    public fun hasIncrementalMargin(): kotlin.Boolean {
      return _builder.hasIncrementalMargin()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin margin = 2;`
     */
    public var margin: openfmb.reservemodule.ReserveMargin
      @JvmName("getMargin")
      get() = _builder.getMargin()
      @JvmName("setMargin")
      set(value) {
        _builder.setMargin(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin margin = 2;`
     */
    public fun clearMargin() {
      _builder.clearMargin()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin margin = 2;`
     * @return Whether the margin field is set.
     */
    public fun hasMargin(): kotlin.Boolean {
      return _builder.hasMargin()
    }

    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin standbyMargin = 3;`
     */
    public var standbyMargin: openfmb.reservemodule.ReserveMargin
      @JvmName("getStandbyMargin")
      get() = _builder.getStandbyMargin()
      @JvmName("setStandbyMargin")
      set(value) {
        _builder.setStandbyMargin(value)
      }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin standbyMargin = 3;`
     */
    public fun clearStandbyMargin() {
      _builder.clearStandbyMargin()
    }
    /**
     * ```
     * MISSING DOCUMENTATION!!!
     * ```
     *
     * `.reservemodule.ReserveMargin standbyMargin = 3;`
     * @return Whether the standbyMargin field is set.
     */
    public fun hasStandbyMargin(): kotlin.Boolean {
      return _builder.hasStandbyMargin()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun openfmb.reservemodule.ReserveAvailability.copy(block: openfmb.reservemodule.ReserveAvailabilityKt.Dsl.() -> kotlin.Unit): openfmb.reservemodule.ReserveAvailability =
  openfmb.reservemodule.ReserveAvailabilityKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val openfmb.reservemodule.ReserveAvailabilityOrBuilder.incrementalMarginOrNull: openfmb.reservemodule.ReserveMargin?
  get() = if (hasIncrementalMargin()) getIncrementalMargin() else null

public val openfmb.reservemodule.ReserveAvailabilityOrBuilder.marginOrNull: openfmb.reservemodule.ReserveMargin?
  get() = if (hasMargin()) getMargin() else null

public val openfmb.reservemodule.ReserveAvailabilityOrBuilder.standbyMarginOrNull: openfmb.reservemodule.ReserveMargin?
  get() = if (hasStandbyMargin()) getStandbyMargin() else null

